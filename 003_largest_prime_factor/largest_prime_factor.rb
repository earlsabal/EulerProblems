def largest_prime_factor(num)

	primes_list = find_all_primes(num)
	largest_prime = primes_list.last

end

def find_all_primes(max)

	primes = []

	for i in 2..max
		primes << i if prime?(i, primes)
		max = reduce_num(i, max)
	end

	primes

end

def prime?(number, primes)

	primes.each do |prime|
		return false if number % prime == 0
	end
	
	true

end

def reduce_num(divisor, number)

	new_number = number
	while (new_number % divisor == 0)
		new_number = new_number / divisor
	end

	new_number

end

# Tracks time
start = Time.now
puts largest_prime_factor(600851475143)
# Answer: 6857
puts "Execution time: #{Time.now - start}"
# Time Elasped: 